@Controller
public class BidController {

    @Autowired
    private BidRepository bidRepository;

    public List<Bid> getAllBids() {
        return bidRepository.findAll();
    }

    public Bid getBidById(int bidId) {
        return bidRepository.findById(bidId)
                .orElseThrow(() -> new ResourceNotFoundException("Bid not found with id: " + bidId));
    }

    public Bid createBid(Bid bid) {
        return bidRepository.save(bid);
    }

    public Bid updateBid(int bidId, Bid bidDetails) {
        Bid bid = bidRepository.findById(bidId)
                .orElseThrow(() -> new ResourceNotFoundException("Bid not found with id: " + bidId));

        bid.setConsumerName(bidDetails.getConsumerName());
        bid.setBidPrice(bidDetails.getBidPrice());
        bid.setConsumerId(bidDetails.getConsumerId());

        return bidRepository.save(bid);
    }

    public void deleteBid(int bidId) {
        Bid bid = bidRepository.findById(bidId)
                .orElseThrow(() -> new ResourceNotFoundException("Bid not found with id: " + bidId));

        bidRepository.delete(bid);
    }
}
