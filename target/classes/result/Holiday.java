public class Holiday {
    private Long id;
    private String createTime;
    private Integer companyId;
    private String name;
    private Double cost;
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public Integer getCompanyId() {
        return this.companyId;
    }
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getCost() {
        return this.cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
}