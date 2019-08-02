package io.altar.projetoFichaColaborador.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	
	@NamedQuery(name = "getAllEmployees", query = "SELECT e FROM Employee e"),
	@NamedQuery(name = "getEmpById", query = "SELECT e FROM Employee e WHERE e.id =:employeeId ")
	
})
public class Employee extends Entity_{
	
	private static final long serialVersionUID = 1L;
	public static final String GET_ALL_EMPLOYEES = "getAllEmployees";
	public static final String GET_EMP_BY_ID = "getEmpById";
	
//	private String username;
//	private String password;
//	private String role ; // to do
//	//private String roles[]= {"admin","owner"};
	private String name;
	private String address;
	private String postalCode;
	private String location;
	private String email;
	private int phoneNumber;
	private String academicQualifications;
	private String academicInstitution;
	private String course;
	private int cc;
	private Date ccValidity;
	private String nationality;
	private Date birthDate;
	private String nif;
	private String niss;
	private String maritalStatus;
	private boolean maritalWorkStatus;
	private int dependents;
	private String dependentAges;
	private String iban;
	private String swift;
	private String professionalCategory = "Consultor de sistemas de Informação";
	private String specialTech;
	private String otherTech;
	private Date admissionDate; //?
	private float grossSalary;
	private String contractType;
	private String extras;
	private boolean twelfths;
	private boolean twelfths5050;
	private boolean twelfths112;
	private boolean foodAllowance;
	private String workSchedule = "9h-18h";
	private boolean sports;
	private String sportsType;
	private String otherActivities;
	private String suggestedActivities;
	private String hobbies;
	private String otherInterests;
	private String client;
	private String clientSector;
	private String project;
	private String fare;
	private String healthInsurance;
	private String companyFinancing;
	private String extensible;
	private String insuranceRelativeName;
	private String insuranceRelativeBirthDate;
	private String companyFinancingRelative;
	
	private String commentarySection;
	//
	private Date created;
	private Date modified;
		
	public Employee() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAcademicQualifications() {
		return academicQualifications;
	}

	public void setAcademicQualifications(String academicQualifications) {
		this.academicQualifications = academicQualifications;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Date getCcValidity() {
		return ccValidity;
	}

	public void setCcValidity(Date ccValidity) {
		this.ccValidity = ccValidity;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNiss() {
		return niss;
	}

	public void setNiss(String niss) {
		this.niss = niss;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public boolean isMaritalWorkStatus() {
		return maritalWorkStatus;
	}

	public void setMaritalWorkStatus(boolean maritalWorkStatus) {
		this.maritalWorkStatus = maritalWorkStatus;
	}

	public int getDependents() {
		return dependents;
	}

	public void setDependents(int dependents) {
		this.dependents = dependents;
	}

	public String getDependentAges() {
		return dependentAges;
	}

	public void setDependentAges(String dependentAges) {
		this.dependentAges = dependentAges;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getSwift() {
		return swift;
	}

	public void setSwift(String swift) {
		this.swift = swift;
	}

	public String getProfessionalCategory() {
		return professionalCategory;
	}

	public void setProfessionalCategory(String professionalCategory) {
		this.professionalCategory = professionalCategory;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public float getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}

	public boolean isTwelfths() {
		return twelfths;
	}

	public void setTwelfths(boolean twelfths) {
		this.twelfths = twelfths;
	}

	public boolean isTwelfths5050() {
		return twelfths5050;
	}

	public void setTwelfths5050(boolean twelfths5050) {
		this.twelfths5050 = twelfths5050;
	}

	public boolean isTwelfths112() {
		return twelfths112;
	}

	public void setTwelfths112(boolean twelfths112) {
		this.twelfths112 = twelfths112;
	}

	public boolean isFoodAllowance() {
		return foodAllowance;
	}

	public void setFoodAllowance(boolean foodAllowance) {
		this.foodAllowance = foodAllowance;
	}

	public String getWorkSchedule() {
		return workSchedule;
	}

	public void setWorkSchedule(String workTine) {
		this.workSchedule = workTine;
	}

	public boolean isSports() {
		return sports;
	}

	public void setSports(boolean sports) {
		this.sports = sports;
	}

	public String getSportsType() {
		return sportsType;
	}

	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}

	public String getOtherActivities() {
		return otherActivities;
	}

	public void setOtherActivities(String otherActivities) {
		this.otherActivities = otherActivities;
	}

	public String getSuggestedActivities() {
		return suggestedActivities;
	}

	public void setSuggestedActivities(String suggestedActivities) {
		this.suggestedActivities = suggestedActivities;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getOtherInterests() {
		return otherInterests;
	}

	public void setOtherInterests(String otherInterests) {
		this.otherInterests = otherInterests;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getAcademicInstitution() {
		return academicInstitution;
	}

	public void setAcademicInstitution(String academicInstitution) {
		this.academicInstitution = academicInstitution;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSpecialTech() {
		return specialTech;
	}

	public void setSpecialTech(String specialTech) {
		this.specialTech = specialTech;
	}

	public String getOtherTech() {
		return otherTech;
	}

	public void setOtherTech(String otherTech) {
		this.otherTech = otherTech;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getClientSector() {
		return clientSector;
	}

	public void setClientSector(String clientSector) {
		this.clientSector = clientSector;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public String getHealthInsurance() {
		return healthInsurance;
	}

	public void setHealthInsurance(String healthInsurance) {
		this.healthInsurance = healthInsurance;
	}

	public String getCommentarySection() {
		return commentarySection;
	}

	public void setCommentarySection(String commentarySection) {
		this.commentarySection = commentarySection;
	}

	public String getInsuranceRelativeName() {
		return insuranceRelativeName;
	}

	public void setInsuranceRelativeName(String insuranceRelativeName) {
		this.insuranceRelativeName = insuranceRelativeName;
	}

	public String getInsuranceRelativeBirthDate() {
		return insuranceRelativeBirthDate;
	}

	public void setInsuranceRelativeBirthDate(String insuranceRelativeBirthDate) {
		this.insuranceRelativeBirthDate = insuranceRelativeBirthDate;
	}

	public String getCompanyFinancing() {
		return companyFinancing;
	}

	public void setCompanyFinancing(String companyFinancing) {
		this.companyFinancing = companyFinancing;
	}

	public String getExtensible() {
		return extensible;
	}

	public void setExtensible(String extensible) {
		this.extensible = extensible;
	}

	public String getCompanyFinancingRelative() {
		return companyFinancingRelative;
	}

	public void setCompanyFinancingRelative(String companyFinancingRelative) {
		this.companyFinancingRelative = companyFinancingRelative;
	}
	
}
