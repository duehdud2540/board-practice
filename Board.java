//변경중
//변경고
//변경대
//변경초
public class Board {
    private int    id;
    private String title;
    private String author;
    // getter/setter 생략
}
    // feature/A: 조회수 기능 추가
    private int viewCount = 0;
    public int  getViewCount()         { return viewCount; }
    public void incrementViewCount()   { this.viewCount++; }
