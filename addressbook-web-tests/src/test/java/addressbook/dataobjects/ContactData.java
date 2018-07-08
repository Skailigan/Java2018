package addressbook.dataobjects;

public class ContactData {
  private final String contactfirstName;
  private final String contactLastName;
  private final String contactMainAddress;
  private final String contactHomePhoneNumber;
  private final String contactEmail;
  private final String birthDayNumber;
  private final String birthMonthNumber;
  private final String birthYear;

  public ContactData(String contactfirstName, String contactLastName, String contactMainAddress, String contactHomePhoneNumber, String contactEmail, String birthDayNumber, String birthMonthNumber, String birthYear) {
    this.contactfirstName = contactfirstName;
    this.contactLastName = contactLastName;
    this.contactMainAddress = contactMainAddress;
    this.contactHomePhoneNumber = contactHomePhoneNumber;
    this.contactEmail = contactEmail;
    this.birthDayNumber = birthDayNumber;
    this.birthMonthNumber = birthMonthNumber;
    this.birthYear = birthYear;
  }

  public String getContactfirstName() {
    return contactfirstName;
  }

  public String getContactLastName() {
    return contactLastName;
  }

  public String getContactMainAddress() {
    return contactMainAddress;
  }

  public String getContactHomePhoneNumber() {
    return contactHomePhoneNumber;
  }

  public String getContactEmail() {
    return contactEmail;
  }

  public String getBirthDayNumber() {
    return birthDayNumber;
  }

  public String getBirthMonthNumber() {
    return birthMonthNumber;
  }

  public String getBirthYear() {
    return birthYear;
  }
}
