package com.catchtwobirds.soboro.content.dto;

import com.catchtwobirds.soboro.content.entity.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.bson.types.ObjectId;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Schema(description = "상담 텍스트 DTO")
public class ContentDto {
    //    @Schema(description = "상담 텍스트 식별번호")
//    private ObjectId contentNo;
    @Schema(description = "상담 식별번호")
    private Integer consultingNo;
    @Schema(description = "상담 텍스트 내용")
    private String contentText;
    @Schema(description = "상담 텍스트 발화자")
    private Boolean contentSpeaker;

    @Builder
    public ContentDto(Content content) {
        this.consultingNo = content.getConsultingNo();
        this.contentText = content.getContentText();
        this.contentSpeaker = content.getContentSpeaker();
    }
}

