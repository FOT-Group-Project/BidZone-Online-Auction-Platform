@Controller
public class SoldItemController {

    @Autowired
    private SoldItemRepository soldItemRepository;

    public List<SoldItem> getAllSoldItems() {
        return soldItemRepository.findAll();
    }

    public SoldItem getSoldItemById(int soldItemId) {
        return soldItemRepository.findById(soldItemId)
                .orElseThrow(() -> new ResourceNotFoundException("SoldItem not found with id: " + soldItemId));
    }

    public SoldItem createSoldItem(SoldItem soldItem) {
        return soldItemRepository.save(soldItem);
    }

    public SoldItem updateSoldItem(int soldItemId, SoldItem soldItemDetails) {
        SoldItem soldItem = soldItemRepository.findById(soldItemId)
                .orElseThrow(() -> new ResourceNotFoundException("SoldItem not found with id: " + soldItemId));

        soldItem.setName(soldItemDetails.getName());
        soldItem.setOwnerName(soldItemDetails.getOwnerName());
        soldItem.setReservePrice(soldItemDetails.getReservePrice());
        soldItem.setImage(soldItemDetails.getImage());
        soldItem.setHammerPrice(soldItemDetails.getHammerPrice());
        soldItem.setConsumerId(soldItemDetails.getConsumerId());
        soldItem.setConsumerName(soldItemDetails.getConsumerName());

        return soldItemRepository.save(soldItem);
    }

    public void deleteSoldItem(int soldItemId) {
        SoldItem soldItem = soldItemRepository.findById(soldItemId)
                .orElseThrow(() -> new ResourceNotFoundException("SoldItem not found with id: " + soldItemId));

        soldItemRepository.delete(soldItem);
    }
}
