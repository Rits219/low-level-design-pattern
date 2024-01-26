package OrderManagementSystem;

public class Main {
    public static void main(String[] args) {
        WarehouseController warehouseController;
        UserController userController;
        OrderController orderController;
        ProductController productController;


        //initialize all object
        warehouseController = new WarehouseController();
        userController = new UserController();
        orderController = new OrderController();
        productController = new ProductController();

        //create products
        Product pepsi = new Product(1, 12, "pepsi");
        Product coke = new Product(2, 13, "coke");
        Product charger = new Product(3, 15, "charger");

        //create addresses
        Address bengaluruAddress = new Address(1, "Bengalore", 560035);
        Address hyderabadAddress = new Address(1, "Hyderabad", 457114);

        //create warehouse in the system
        Warehouse bengaluruWarehouse = new Warehouse(1, bengaluruAddress);
        warehouseController.addWarehouse(bengaluruWarehouse);

        Warehouse hyderabadWarehouse = new Warehouse(1, hyderabadAddress);
        warehouseController.addWarehouse(hyderabadWarehouse);

        //add some products in warehouse
        bengaluruWarehouse.addProduct(pepsi, productController);
        bengaluruWarehouse.addProduct(coke, productController);


        //create user in the system
        User sawan = new User(1, "Sawan", bengaluruAddress);
        userController.addUser(sawan);

        //get warehouse for sawan
        Warehouse warehouse = warehouseController.selectWarehouse();
        //display all the products which are in that particular warehouse
        warehouse.displayInventory();
        //sawan clicks on add button of coke
        sawan.updatedProductInCart(2, 1);

        //create order for sawan
        double totalItemPrice = sawan.getCart().getTotalItemPrice(productController);
        Invoice invoice = new Invoice(totalItemPrice, 5, totalItemPrice + 5);
        Order order=orderController.createOrder(sawan, warehouse, invoice, 1);


    }
}
