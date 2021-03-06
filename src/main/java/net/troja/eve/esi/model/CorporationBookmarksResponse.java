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
import java.time.OffsetDateTime;
import net.troja.eve.esi.model.CorporationBookmarkItem;
import net.troja.eve.esi.model.CorporationBookmarksCoordinates;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationBookmarksResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("bookmark_id")
    private Integer bookmarkId = null;

    @JsonProperty("coordinates")
    private CorporationBookmarksCoordinates coordinates = null;

    @JsonProperty("created")
    private OffsetDateTime created = null;

    @JsonProperty("creator_id")
    private Integer creatorId = null;

    @JsonProperty("folder_id")
    private Integer folderId = null;

    @JsonProperty("item")
    private CorporationBookmarkItem item = null;

    @JsonProperty("label")
    private String label = null;

    @JsonProperty("location_id")
    private Integer locationId = null;

    @JsonProperty("notes")
    private String notes = null;

    public CorporationBookmarksResponse bookmarkId(Integer bookmarkId) {
        this.bookmarkId = bookmarkId;
        return this;
    }

    /**
     * bookmark_id integer
     * 
     * @return bookmarkId
     **/
    @ApiModelProperty(example = "null", required = true, value = "bookmark_id integer")
    public Integer getBookmarkId() {
        return bookmarkId;
    }

    public void setBookmarkId(Integer bookmarkId) {
        this.bookmarkId = bookmarkId;
    }

    public CorporationBookmarksResponse coordinates(CorporationBookmarksCoordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * Get coordinates
     * 
     * @return coordinates
     **/
    @ApiModelProperty(example = "null", value = "")
    public CorporationBookmarksCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(CorporationBookmarksCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    public CorporationBookmarksResponse created(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * created string
     * 
     * @return created
     **/
    @ApiModelProperty(example = "null", required = true, value = "created string")
    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public CorporationBookmarksResponse creatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * creator_id integer
     * 
     * @return creatorId
     **/
    @ApiModelProperty(example = "null", required = true, value = "creator_id integer")
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public CorporationBookmarksResponse folderId(Integer folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * folder_id integer
     * 
     * @return folderId
     **/
    @ApiModelProperty(example = "null", value = "folder_id integer")
    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public CorporationBookmarksResponse item(CorporationBookmarkItem item) {
        this.item = item;
        return this;
    }

    /**
     * Get item
     * 
     * @return item
     **/
    @ApiModelProperty(example = "null", value = "")
    public CorporationBookmarkItem getItem() {
        return item;
    }

    public void setItem(CorporationBookmarkItem item) {
        this.item = item;
    }

    public CorporationBookmarksResponse label(String label) {
        this.label = label;
        return this;
    }

    /**
     * label string
     * 
     * @return label
     **/
    @ApiModelProperty(example = "null", required = true, value = "label string")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CorporationBookmarksResponse locationId(Integer locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * location_id integer
     * 
     * @return locationId
     **/
    @ApiModelProperty(example = "null", required = true, value = "location_id integer")
    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public CorporationBookmarksResponse notes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * notes string
     * 
     * @return notes
     **/
    @ApiModelProperty(example = "null", required = true, value = "notes string")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationBookmarksResponse corporationBookmarksResponse = (CorporationBookmarksResponse) o;
        return Objects.equals(this.bookmarkId, corporationBookmarksResponse.bookmarkId)
                && Objects.equals(this.coordinates, corporationBookmarksResponse.coordinates)
                && Objects.equals(this.created, corporationBookmarksResponse.created)
                && Objects.equals(this.creatorId, corporationBookmarksResponse.creatorId)
                && Objects.equals(this.folderId, corporationBookmarksResponse.folderId)
                && Objects.equals(this.item, corporationBookmarksResponse.item)
                && Objects.equals(this.label, corporationBookmarksResponse.label)
                && Objects.equals(this.locationId, corporationBookmarksResponse.locationId)
                && Objects.equals(this.notes, corporationBookmarksResponse.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookmarkId, coordinates, created, creatorId, folderId, item, label, locationId, notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationBookmarksResponse {\n");

        sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
        sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
