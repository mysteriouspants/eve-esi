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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationActiveTotalKills;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationLastWeekKills;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationYesterdayKills;
import java.io.Serializable;

/**
 * Top 10 rankings of corporations by number of kills from yesterday, last week
 * and in total
 */
@ApiModel(description = "Top 10 rankings of corporations by number of kills from yesterday, last week and in total")
public class FactionWarfareLeaderboardCorporationsKills implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("active_total")
    private List<FactionWarfareLeaderboardCorporationActiveTotalKills> activeTotal = new ArrayList<FactionWarfareLeaderboardCorporationActiveTotalKills>();

    @SerializedName("last_week")
    private List<FactionWarfareLeaderboardCorporationLastWeekKills> lastWeek = new ArrayList<FactionWarfareLeaderboardCorporationLastWeekKills>();

    @SerializedName("yesterday")
    private List<FactionWarfareLeaderboardCorporationYesterdayKills> yesterday = new ArrayList<FactionWarfareLeaderboardCorporationYesterdayKills>();

    public FactionWarfareLeaderboardCorporationsKills activeTotal(
            List<FactionWarfareLeaderboardCorporationActiveTotalKills> activeTotal) {
        this.activeTotal = activeTotal;
        return this;
    }

    public FactionWarfareLeaderboardCorporationsKills addActiveTotalItem(
            FactionWarfareLeaderboardCorporationActiveTotalKills activeTotalItem) {
        this.activeTotal.add(activeTotalItem);
        return this;
    }

    /**
     * Top 10 ranking of corporations active in faction warfare by total kills.
     * A corporation is considered \"active\" if they have participated in
     * faction warfare in the past 14 days
     * 
     * @return activeTotal
     **/
    @ApiModelProperty(example = "null", required = true, value = "Top 10 ranking of corporations active in faction warfare by total kills. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days")
    public List<FactionWarfareLeaderboardCorporationActiveTotalKills> getActiveTotal() {
        return activeTotal;
    }

    public void setActiveTotal(List<FactionWarfareLeaderboardCorporationActiveTotalKills> activeTotal) {
        this.activeTotal = activeTotal;
    }

    public FactionWarfareLeaderboardCorporationsKills lastWeek(
            List<FactionWarfareLeaderboardCorporationLastWeekKills> lastWeek) {
        this.lastWeek = lastWeek;
        return this;
    }

    public FactionWarfareLeaderboardCorporationsKills addLastWeekItem(
            FactionWarfareLeaderboardCorporationLastWeekKills lastWeekItem) {
        this.lastWeek.add(lastWeekItem);
        return this;
    }

    /**
     * Top 10 ranking of corporations by kills in the past week
     * 
     * @return lastWeek
     **/
    @ApiModelProperty(example = "null", required = true, value = "Top 10 ranking of corporations by kills in the past week")
    public List<FactionWarfareLeaderboardCorporationLastWeekKills> getLastWeek() {
        return lastWeek;
    }

    public void setLastWeek(List<FactionWarfareLeaderboardCorporationLastWeekKills> lastWeek) {
        this.lastWeek = lastWeek;
    }

    public FactionWarfareLeaderboardCorporationsKills yesterday(
            List<FactionWarfareLeaderboardCorporationYesterdayKills> yesterday) {
        this.yesterday = yesterday;
        return this;
    }

    public FactionWarfareLeaderboardCorporationsKills addYesterdayItem(
            FactionWarfareLeaderboardCorporationYesterdayKills yesterdayItem) {
        this.yesterday.add(yesterdayItem);
        return this;
    }

    /**
     * Top 10 ranking of corporations by kills in the past day
     * 
     * @return yesterday
     **/
    @ApiModelProperty(example = "null", required = true, value = "Top 10 ranking of corporations by kills in the past day")
    public List<FactionWarfareLeaderboardCorporationYesterdayKills> getYesterday() {
        return yesterday;
    }

    public void setYesterday(List<FactionWarfareLeaderboardCorporationYesterdayKills> yesterday) {
        this.yesterday = yesterday;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCorporationsKills factionWarfareLeaderboardCorporationsKills = (FactionWarfareLeaderboardCorporationsKills) o;
        return Objects.equals(this.activeTotal, factionWarfareLeaderboardCorporationsKills.activeTotal)
                && Objects.equals(this.lastWeek, factionWarfareLeaderboardCorporationsKills.lastWeek)
                && Objects.equals(this.yesterday, factionWarfareLeaderboardCorporationsKills.yesterday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeTotal, lastWeek, yesterday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCorporationsKills {\n");

        sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
        sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
        sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
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
