package domain.demography;

public class Race {
    private int id;
    private String type;

    private Race(){

    }

    public Race(Builder builder){

        this.id = builder.id;
        this.type = builder.type;

    }

    public int getID(){

        return id;

    }

    public void setID(int id){

        this.id = id;

    }

    public String getType(){

        return type;

    }

    public void setType(String type){

        this.type = type;

    }

    @Override
    public String toString() {
        return "Race" + "\n"  +  "Id: " + id + "\n" + "Type: " + type;
    }

    public static class Builder {

        private int id;
        private String type;

        public Builder ID(int id){

            this.id = id;
            return this;
        }
        public Builder type(String type){

            this.type = type;
            return this;
        }
        public Race build(){

            return new Race(this);
        }
    }
}

