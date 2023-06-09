package pdp_package;

public class ProxyPatternClient {

    public static final String EMPLOYEE_NAME = "Aayush Sharma";

    public static void main(String[] args) {
        InternetAccess internetAccess = new ProxyEmployeeInternetAccess(EMPLOYEE_NAME);
        internetAccess.grantInternetAccessToEmployees();
    }
}