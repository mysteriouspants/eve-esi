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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class ContactsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("contact_id")
    private Integer contactId = null;

    /**
     * contact_type string
     */
    public enum ContactTypeEnum {
        CHARACTER("character"),

        CORPORATION("corporation"),

        ALLIANCE("alliance"),

        FACTION("faction");

        private String value;

        ContactTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ContactTypeEnum fromValue(String text) {
            for (ContactTypeEnum b : ContactTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("contact_type")
    private ContactTypeEnum contactType = null;

    @JsonProperty("is_blocked")
    private Boolean isBlocked = null;

    @JsonProperty("is_watched")
    private Boolean isWatched = null;

    @JsonProperty("label_ids")
    private List<Long> labelIds = new ArrayList<Long>();

    @JsonProperty("standing")
    private Float standing = null;

    public ContactsResponse contactId(Integer contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * contact_id integer
     * 
     * @return contactId
     **/
    @ApiModelProperty(example = "null", required = true, value = "contact_id integer")
    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public ContactsResponse contactType(ContactTypeEnum contactType) {
        this.contactType = contactType;
        return this;
    }

    /**
     * contact_type string
     * 
     * @return contactType
     **/
    @ApiModelProperty(example = "null", required = true, value = "contact_type string")
    public ContactTypeEnum getContactType() {
        return contactType;
    }

    public void setContactType(ContactTypeEnum contactType) {
        this.contactType = contactType;
    }

    public ContactsResponse isBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
        return this;
    }

    /**
     * Whether this contact is in the blocked list. Note a missing value denotes
     * unknown, not true or false
     * 
     * @return isBlocked
     **/
    @ApiModelProperty(example = "null", value = "Whether this contact is in the blocked list. Note a missing value denotes unknown, not true or false")
    public Boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public ContactsResponse isWatched(Boolean isWatched) {
        this.isWatched = isWatched;
        return this;
    }

    /**
     * Whether this contact is being watched
     * 
     * @return isWatched
     **/
    @ApiModelProperty(example = "null", value = "Whether this contact is being watched")
    public Boolean getIsWatched() {
        return isWatched;
    }

    public void setIsWatched(Boolean isWatched) {
        this.isWatched = isWatched;
    }

    public ContactsResponse labelIds(List<Long> labelIds) {
        this.labelIds = labelIds;
        return this;
    }

    public ContactsResponse addLabelIdsItem(Long labelIdsItem) {
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
     * label_ids array
     * 
     * @return labelIds
     **/
    @ApiModelProperty(example = "null", value = "label_ids array")
    public List<Long> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<Long> labelIds) {
        this.labelIds = labelIds;
    }

    public ContactsResponse standing(Float standing) {
        this.standing = standing;
        return this;
    }

    /**
     * Standing of the contact
     * 
     * @return standing
     **/
    @ApiModelProperty(example = "null", required = true, value = "Standing of the contact")
    public Float getStanding() {
        return standing;
    }

    public void setStanding(Float standing) {
        this.standing = standing;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContactsResponse contactsResponse = (ContactsResponse) o;
        return Objects.equals(this.contactId, contactsResponse.contactId)
                && Objects.equals(this.contactType, contactsResponse.contactType)
                && Objects.equals(this.isBlocked, contactsResponse.isBlocked)
                && Objects.equals(this.isWatched, contactsResponse.isWatched)
                && Objects.equals(this.labelIds, contactsResponse.labelIds)
                && Objects.equals(this.standing, contactsResponse.standing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, contactType, isBlocked, isWatched, labelIds, standing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactsResponse {\n");

        sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
        sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
        sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
        sb.append("    isWatched: ").append(toIndentedString(isWatched)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
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
