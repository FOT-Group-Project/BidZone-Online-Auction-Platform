@Controller
public class StatusController {

    @Autowired
    private StatusRepository statusRepository;

    public List<Status> getAllStatuses() {
        return statusRepository.findAll();
    }

    public Status getStatusById(int statusId) {
        return statusRepository.findById(statusId)
                .orElseThrow(() -> new ResourceNotFoundException("Status not found with id: " + statusId));
    }

    public Status createStatus(Status status) {
        return statusRepository.save(status);
    }

    public Status updateStatus(int statusId, Status statusDetails) {
        Status status = statusRepository.findById(statusId)
                .orElseThrow(() -> new ResourceNotFoundException("Status not found with id: " + statusId));

        status.setAuction(statusDetails.getAuction());
        status.setTime(statusDetails.getTime());

        return statusRepository.save(status);
    }

    public void deleteStatus(int statusId) {
        Status status = statusRepository.findById(statusId)
                .orElseThrow(() -> new ResourceNotFoundException("Status not found with id: " + statusId));

        statusRepository.delete
