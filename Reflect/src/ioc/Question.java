package ioc;

public class Question {
    private String title;
    private String answer;

    public Question() {

    }

    @Override
    public String toString() {
        return "Question{" +
                "title='" + title + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
