@Controller
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(int itemId) {
        return itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found with id: " + itemId));
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(int itemId, Item itemDetails) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found with id: " + itemId));

        item.setName(itemDetails.getName());
        item.setOwnerName(itemDetails.getOwnerName());
        item.setReservePrice(itemDetails.getReservePrice());
        item.setImage(itemDetails.getImage());

        return itemRepository.save(item);
    }

    public void deleteItem(int itemId) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found with id: " + itemId));

        itemRepository.delete(item);
    }
}
