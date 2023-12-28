package homework04.data;

abstract public class User {
    private String surname;
    private String firstname;
    private String patronymic;

    public User(String surname, String firstname, String patronymic) {
        if (firstname.isEmpty() || surname.isEmpty() || patronymic.isEmpty()) {
            throw new IllegalArgumentException("Имя фамилия или отчество должно быть заполнены");
        }
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public void setFirstname(String firstname) {
        if (firstname.isEmpty()){
            throw new IllegalArgumentException("Фамилия не может быть пуста");
        }
        this.firstname = firstname;
    }
}
