public class User {

String name;

    public static class Builder {

        String name;
        String emailAddress;
        int age;
        String address;
        String city;
        String zipCode;


        public Builder email(String emailAddress){
            this.emailAddress = emailAddress;

            return this;
        }

        public Builder userAger(int age){
            this.age = age;

            return this;
        }

        public Builder userAddress(String address){
            this.address = address;

            return this;
        }

        public Builder userCity(String city){
            this.city = city;

            return this;
        }

        public Builder userZipCode(String zipCode){
            this.zipCode = zipCode;

            return this;
        }

        public User build(){
        User Angelica = new User();

        emailAddress = this.emailAddress;
        age = this.age;
        address = this.address;
        city = this.city;
        zipCode = this.zipCode;

        return Angelica;
        }

        public Builder(String name) {
            this.name = name;
        }
    }
}