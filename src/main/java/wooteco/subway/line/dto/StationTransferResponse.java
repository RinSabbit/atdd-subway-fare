package wooteco.subway.line.dto;

import java.util.List;

public class StationTransferResponse {

    private Long id;
    private String name;
    private List<TransferLineResponse> transferLines;

    public StationTransferResponse() {
    }

    public StationTransferResponse(Long id, String name,
        List<TransferLineResponse> transferLines) {
        this.id = id;
        this.name = name;
        this.transferLines = transferLines;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<TransferLineResponse> getTransferLines() {
        return transferLines;
    }
}