@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int customerId) {
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + customerId));
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(int customerId, Customer customerDetails) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + customerId));

        customer.setName(customerDetails.getName());
        customer.setNickName(customerDetails.getNickName());
        customer.setAddress(customerDetails.getAddress());
        customer.setDob(customerDetails.getDob());
        customer.setMob(customerDetails.getMob());
        customer.setPassword(customerDetails.getPassword());

        return customerRepository.save(customer);
    }

    public void deleteCustomer(int customerId) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + customerId));

        customerRepository.delete(customer);
    }
}
