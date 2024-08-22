public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = "4444 № 44564444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-67";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 9;
        post.birthday.month = 6;
        post.birthday.year = 2001;
    }
}