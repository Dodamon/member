package mpti.domain.member.dto;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class StatusDto {
    private List<String> part;
    private LocalDate date;
    private String record;
    private Long userId;

    public void setPart(List<String> part) {
        this.part = part;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
