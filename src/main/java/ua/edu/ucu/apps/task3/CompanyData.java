package ua.edu.ucu.apps.task3;

public class CompanyData {
    private String domain;
    private String description;
    private String logo;
    private String address;

    public CompanyData(String domain, String description, String logo, String address) {
        this.domain = domain;
        this.description = description;
        this.logo = logo;
        this.address = address;
    }
    public static class Builder {
        private String domain;
        private String description;
        private String logo;
        private String address;

        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder logo(String logo) {
            this.logo = logo;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public CompanyData build() {
            return new CompanyData(domain, description, logo, address);
        }
    }
}
