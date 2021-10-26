package es.lavanda.lib.common.model;

import lombok.Data;

/**
 * Class for SNS notification
 */
@Data
public class TelegramMessage {
    
    private String to;

    private String textMessage;

    private String photo;

}
