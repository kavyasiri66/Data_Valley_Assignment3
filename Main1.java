class Organization {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(String organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    public Organization(Organization org) {
        this.organizationCode = org.organizationCode;
        this.organizationName = org.organizationName;
        this.organizationAddress = org.organizationAddress;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Organization originalOrg = new Organization("Data Valley", "Sample Organization", "123 Main St, City");

        Organization clonedOrg = new Organization(originalOrg);

        System.out.println("Original Organization Details:");
        originalOrg.printDetails();
        System.out.println("\nCloned Organization Details:");
        clonedOrg.printDetails();
    }
}
