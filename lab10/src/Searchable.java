import java.time.LocalDateTime;

public interface Searchable {
    public boolean search(LocalDateTime dateStarttime, LocalDateTime dateEndTime);
}
