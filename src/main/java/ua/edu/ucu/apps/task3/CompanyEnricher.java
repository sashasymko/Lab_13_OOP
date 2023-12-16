package ua.edu.ucu.apps.task3;

public class CompanyEnricher {
    public CompanyData enrich(String domain) {
        return new CompanyData.Builder()
                .domain(domain)
                .description("Example Description")
                .logo("Example Logo URL")
                .address("Example Address")
                .build();
    }
}
