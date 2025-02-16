import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChọn thao tác:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Cập nhật sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị sản phẩm theo giá");
            System.out.println("5. Hiển thị sản phẩm theo đánh giá");
            System.out.println("6. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới

            switch (choice) {
                case 1: // Thêm sản phẩm
                    System.out.print("Nhập ID sản phẩm: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    System.out.print("Nhập đánh giá sản phẩm: ");
                    double rating = scanner.nextDouble();
                    manager.addProduct(new Product(id, name, price, rating));
                    break;

                case 2: // Cập nhật sản phẩm
                    System.out.print("Nhập ID sản phẩm cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Nhập đánh giá mới: ");
                    double newRating = scanner.nextDouble();
                    manager.updateProduct(updateId, newName, newPrice, newRating);
                    break;

                case 3: // Xóa sản phẩm
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteProduct(deleteId);
                    break;

                case 4: // Hiển thị sản phẩm theo giá
                    System.out.println("Sản phẩm được sắp xếp theo giá:");
                    manager.displayProductsSortedByPrice();
                    break;

                case 5: // Hiển thị sản phẩm theo đánh giá
                    System.out.println("Sản phẩm được sắp xếp theo đánh giá:");
                    manager.displayProductsSortedByRating();
                    break;

                case 6: // Thoát
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}