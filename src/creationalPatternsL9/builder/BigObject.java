package creationalPatternsL9.builder;

public class BigObject {
    private String param1;
    private String param2;
    private String param3;
    private String param4;
    private String param5;

    public BigObject(String param1, String param2, String param3, String param4, String param5) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
    }

    public BigObject(Builder builder) {
        param1 = builder.param1;
        param2 = builder.param2;
        param3 = builder.param3;
        param4 = builder.param4;
        param5 = builder.param5;
    }

    public static class Builder {
        private String param1; // обязательное поле
        private String param2;
        private String param3;
        private String param4;
        private String param5;

        Builder(String param1) {
            if (param1 == null) {
                throw new IllegalArgumentException("param1 cannot be null");
            }

            this.param1 = param1;
        }

        Builder withParam2 (String param2) {
            this.param2 = param2;
            return this;
        }

        Builder withParam3 (String param3) {
            this.param3 = param3;
            return this;
        }

        Builder withParam4 (String param4) {
            this.param4 = param4;
            return this;
        }

        Builder withParam5 (String param5) {
            this.param5 = param5;
            return this;
        }

        BigObject build(){
            return new BigObject(this);
         //   return new BigObject(param1, param2, param3, param4, param5);
        }
    }
}
