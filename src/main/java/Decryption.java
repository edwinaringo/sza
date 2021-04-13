public class Decryption {
    public String textMessage;
    public int shiftBy;

    public Decryption(String textMessage, int shiftBy) {
        this.textMessage = textMessage;
        this.shiftBy = shiftBy;
    }

    public String getTextMessage() {

        return this.textMessage;
    }

    public int getShiftBy() {
        return this.shiftBy;
    }

    public String decryption() {
        int reverseShift = 26 - (shiftBy % 26);
        StringBuilder sb = new StringBuilder();
        for (char character : textMessage.toCharArray()) {
            if (character != ' ') {
                int asciiPosition = character - 'a';
                int newPosition = (asciiPosition + reverseShift) % 26;
                char newCharacter = (char) ('a' + newPosition);
                sb.append(newCharacter);
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }

}
