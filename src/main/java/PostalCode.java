public enum PostalCode {


    ZERO("*****\n*****\n**\n**\n**"),
    ONE("**\n**\n**\n*****\n*****"),
    TWO("**\n**\n*****\n**\n*****"),
    THREE("**\n**\n*****\n*****\n**"),
    FOUR("**\n*****\n**\n**\n*****"),
    FIVE("**\n*****\n**\n*****\n**"),
    SIX("**\n*****\n*****\n**\n**"),
    SEVEN("*****\n**\n**\n**\n*****"),
    EIGHT("*****\n**\n**\n*****\n**"),
    NINE("*****\n**\n*****\n**\n**");


    private String code;

    PostalCode(String code) {
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}