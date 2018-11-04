/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * character_id and response of an attendee
 */
@ApiModel(description = "character_id and response of an attendee")
public class CharacterCalendarAttendeesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("character_id")
    private Integer characterId = null;

    /**
     * event_response string
     */
    public enum EventResponseEnum {
        @SerializedName("declined")
        DECLINED("declined"),

        @SerializedName("not_responded")
        NOT_RESPONDED("not_responded"),

        @SerializedName("accepted")
        ACCEPTED("accepted"),

        @SerializedName("tentative")
        TENTATIVE("tentative");

        private String value;

        EventResponseEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @SerializedName("event_response")
    private EventResponseEnum eventResponse = null;

    public CharacterCalendarAttendeesResponse characterId(Integer characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(example = "null", value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public CharacterCalendarAttendeesResponse eventResponse(EventResponseEnum eventResponse) {
        this.eventResponse = eventResponse;
        return this;
    }

    /**
     * event_response string
     * 
     * @return eventResponse
     **/
    @ApiModelProperty(example = "null", value = "event_response string")
    public EventResponseEnum getEventResponse() {
        return eventResponse;
    }

    public void setEventResponse(EventResponseEnum eventResponse) {
        this.eventResponse = eventResponse;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterCalendarAttendeesResponse characterCalendarAttendeesResponse = (CharacterCalendarAttendeesResponse) o;
        return Objects.equals(this.characterId, characterCalendarAttendeesResponse.characterId)
                && Objects.equals(this.eventResponse, characterCalendarAttendeesResponse.eventResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, eventResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterCalendarAttendeesResponse {\n");

        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    eventResponse: ").append(toIndentedString(eventResponse)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
