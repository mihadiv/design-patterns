package src.flyweight;

public class CustomEmoji implements EmojiSymbol {

    private String imageCode;
    private String name;

    public CustomEmoji(String imageCode, String name) {
        this.imageCode = imageCode;
        this.name = name;
    }

    @Override
    public void display(EmojiPosition emojiPosition) {
        System.out.println("[" + name + "] emoji: " + emojiPosition.getLine() + ":"
                + emojiPosition.getColumn());
    }
}
