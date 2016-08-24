public class holiday {
    private Long Id;
    private String CreateTime;
    private Integer CompanyId;
    private String Name;
    private Double Cost;
    public Long getId() {
        return Id;
    }
    public void setId(Long Id) {
        this.Id = Id;
    }
    public String getCreateTime() {
        return CreateTime;
    }
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }
    public Integer getCompanyId() {
        return CompanyId;
    }
    public void setCompanyId(Integer CompanyId) {
        this.CompanyId = CompanyId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public Double getCost() {
        return Cost;
    }
    public void setCost(Double Cost) {
        this.Cost = Cost;
    }
}