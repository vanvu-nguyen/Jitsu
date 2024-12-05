package pageObjects;

import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.time.Instant;
import java.util.*;

import static io.restassured.RestAssured.given;

public class GithubPO {

    static Response response;
    static JsonPath jsonPath;
    static List<Integer> openIssueCountList = new ArrayList<>();
    static List<String> updateDateList = new ArrayList<>();
    static Map<String, String> repoUpdateAndName = new HashMap<>();
    static Map<Integer, String> repoWatcherAndName = new HashMap<>();
    static int maxWatcherValue = 0;
    static String token = "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";


    public Response iSendRequestToGetAllRepositoriesBelongsToSeleniumHQ() {
        RequestSpecification request = given();
        request.baseUri("https://api.github.com/orgs/SeleniumHQ/repos");
        request.header(new Header("Accept", "application/vnd.github+json"));
        request.header(new Header("Authorization", "Bearer " + token));
        request.header(new Header("X-GitHub-Api-Version", "2022-11-28"));
        response = request.get();
        jsonPath = new JsonPath(response.asString());
        return response;
    }

    public List<Integer> iLoopThroughAllRepositoriesToGetAllOpenIssueNumber() {
        openIssueCountList = jsonPath.getList("open_issues");
        return openIssueCountList;
    }

    public int iAddAllItUpThenReturnTheTotalOpenIssueCount() {
        int totalOpenIssueCount = 0;
        for (int count: openIssueCountList) {
            totalOpenIssueCount = totalOpenIssueCount + count;
        }
        return totalOpenIssueCount;
    }

    public List<String> iSortTheDateUpdatedInDescendingOrder() {
        for (int i = 0; i < openIssueCountList.size(); i++) {
            String dateParam = "[" + i + "]" + ".updated_at";
            String nameParam = "[" + i + "]" + ".name";
            String watcherParam = "[" + i + "]" + ".watchers";
            repoUpdateAndName.put(jsonPath.getString(dateParam), jsonPath.getString(nameParam));
            repoWatcherAndName.put(jsonPath.getInt(watcherParam), jsonPath.getString(nameParam));
        }
        for (String key: repoUpdateAndName.keySet()) {
            updateDateList.add(key);
        }
        Collections.sort(updateDateList, (a, b) -> Instant.parse(b).compareTo(Instant.parse(a)));
        return updateDateList;
    }

    public List<String> iCreateANewRepositoryListWithSortedDateUpdateOrderThenReturnTheList() {
        List<String> repoAfterSorted = new ArrayList<>();
        for (int i = 0; i < updateDateList.size(); i++) {
            repoAfterSorted.add(repoUpdateAndName.get(updateDateList.get(i)));
        }
        return repoAfterSorted;
    }

    public int iFindTheGreatestWatcherNumber() {
        List<Integer> watcherList = new ArrayList<>();
        for (int key: repoWatcherAndName.keySet()) {
            watcherList.add(key);
        }
        maxWatcherValue = watcherList.get(0);
        for (int max: watcherList) {
            if (max > maxWatcherValue) {
                maxWatcherValue = max;
            }
        }
        return maxWatcherValue;
    }

    public String iRetrieveRepositoryOwnsGreatestWatcherNumberThenReturnTheRepository() {
        return repoWatcherAndName.get(maxWatcherValue);
    }
}
