package src.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CustomEmojiFactory {

    private Map<String, EmojiSymbol> collection = new HashMap<String, EmojiSymbol>();
    private int emojisCreated = 0;

    public EmojiSymbol getEmoji(String emojiName) {
        if (!collection.containsKey(emojiName)) {
            EmojiSymbol emoji = new CustomEmoji("Unicode", emojiName);
            emojisCreated++;
            collection.put(emojiName, emoji);
        }
        return collection.get(emojiName);
    }

    public int getEmojisCreated() {
        return emojisCreated;
    }
}
