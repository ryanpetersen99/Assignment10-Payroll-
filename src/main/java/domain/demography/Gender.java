package domain.demography;

public class Gender {
    private int id;
    private String type;

    private Gender(){

    }

    public Gender(Builder builder){

        this.id = builder.id;
        this.type = builder.type;

    }


    public int getId(){
        return id;
    }

    public String getType(){
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Gender" + "\n" + "ID: " + id + "\n" + "Type: " + type;
    }


    public static class Builder {

        private int id;
        private String type;

        public Builder id(int id){

            this.id = id;
            return this;

        }

        public Builder type(String type){

            this.type = type;
            return this;

        }

        public Gender build(){

            return new Gender(this);

        }
    }
}
