/*
 * Copyright 2012 Ryuji Yamashita
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package facebook4j.internal.json;

import java.util.List;

import facebook4j.*;
import facebook4j.internal.http.HttpResponse;
import facebook4j.internal.org.json.JSONObject;

/**
 * @author Ryuji Yamashita - roundrop at gmail.com
 */
public interface z_F4JInternalFactory extends java.io.Serializable {

    User createUser(JSONObject json) throws FacebookException;
    User createUser(HttpResponse res) throws FacebookException;
    ResponseList<User> createUserList(HttpResponse res) throws FacebookException;
    List<User> createUserArray(HttpResponse res) throws FacebookException;

    IdNameEntity createIdNameEntity(HttpResponse res) throws FacebookException;
    ResponseList<IdNameEntity> createIdNameEntityList(HttpResponse res) throws FacebookException;

    ResponseList<Account> createAccountList(HttpResponse res) throws FacebookException;
    
    ResponseList<Achievement> createAchievementList(HttpResponse res) throws FacebookException;
    
    ResponseList<Activity> createActivityList(HttpResponse res) throws FacebookException;
    
    Album createAlbum(HttpResponse res) throws FacebookException;
    ResponseList<Album> createAlbumList(HttpResponse res) throws FacebookException;

    ResponseList<Book> createBookList(HttpResponse res) throws FacebookException;

    Checkin createCheckin(HttpResponse res) throws FacebookException;
    ResponseList<Checkin> createCheckinList(HttpResponse res) throws FacebookException;
    
    Comment createComment(HttpResponse res) throws FacebookException;
    ResponseList<Comment> createCommentList(HttpResponse res) throws FacebookException;
    
    Domain createDomain(HttpResponse res) throws FacebookException;
    List<Domain> createDomainArray(HttpResponse res) throws FacebookException;

    Event createEvent(HttpResponse res) throws FacebookException;
    ResponseList<Event> createEventList(HttpResponse res) throws FacebookException;
    ResponseList<RSVPStatus> createRSVPStatusList(HttpResponse res) throws FacebookException;
    
    ResponseList<Family> createFamilyList(HttpResponse res) throws FacebookException;
    
    ResponseList<Post> createPostList(HttpResponse res) throws FacebookException;
    Post createPost(HttpResponse res) throws FacebookException;
    
    Friendlist createFriendlist(HttpResponse res) throws FacebookException;
    ResponseList<Friendlist> createFriendlistList(HttpResponse res) throws FacebookException;
    
    ResponseList<FriendRequest> createFriendRequestList(HttpResponse res) throws FacebookException;
    
    ResponseList<Friend> createFriendList(HttpResponse res) throws FacebookException;

    ResponseList<Game> createGameList(HttpResponse res) throws FacebookException;
    
    Group createGroup(HttpResponse res) throws FacebookException;
    ResponseList<Group> createGroupList(HttpResponse res) throws FacebookException;

    ResponseList<GroupDoc> createGroupDocList(HttpResponse res) throws FacebookException;
    InboxResponseList<Inbox> createInboxList(HttpResponse res) throws FacebookException;
    
    ResponseList<Interest> createInterestList(HttpResponse res) throws FacebookException;

    ResponseList<Like> createLikeList(HttpResponse res) throws FacebookException;
    
    Link createLink(HttpResponse res) throws FacebookException;
    ResponseList<Link> createLinkList(HttpResponse res) throws FacebookException;
    
    ResponseList<Location> createLocationList(HttpResponse res) throws FacebookException;
    
    ResponseList<Movie> createMovieList(HttpResponse res) throws FacebookException;
    
    ResponseList<Music> createMusicList(HttpResponse res) throws FacebookException;
    
    Note createNote(HttpResponse res) throws FacebookException;
    ResponseList<Note> createNoteList(HttpResponse res) throws FacebookException;
    
    ResponseList<Notification> createNotificationList(HttpResponse res) throws FacebookException;

    Page createPage(HttpResponse res) throws FacebookException;
    ResponseList<Page> createPageList(HttpResponse res) throws FacebookException;

    ResponseList<PageSetting> createPageSettingList(HttpResponse res) throws FacebookException;

    Message createMessage(HttpResponse res) throws FacebookException;
    ResponseList<Message> createMessageList(HttpResponse res) throws FacebookException;
    
    List<Permission> createPermissions(HttpResponse res) throws FacebookException;

    ResponseList<Place> createPlaceList(HttpResponse res) throws FacebookException;
    
    Photo createPhoto(HttpResponse res) throws FacebookException;
    ResponseList<Photo> createPhotoList(HttpResponse res) throws FacebookException;

    ResponseList<Poke> createPokeList(HttpResponse res) throws FacebookException;

    Question createQuestion(HttpResponse res) throws FacebookException;
    ResponseList<Question> createQuestionList(HttpResponse res) throws FacebookException;
    ResponseList<Question.Option> createQuestionOptionList(HttpResponse res) throws FacebookException;
    ResponseList<QuestionVotes> createQuestionVotesList(HttpResponse res) throws FacebookException;
    
    ResponseList<Score> createScoreList(HttpResponse res) throws FacebookException;
    
    ResponseList<Subscribedto> createSubscribedtoList(HttpResponse res) throws FacebookException;
    
    ResponseList<Subscriber> createSubscriberList(HttpResponse res) throws FacebookException;
    
    ResponseList<Television> createTelevisionList(HttpResponse res) throws FacebookException;
    
    Video createVideo(HttpResponse res) throws FacebookException;
    ResponseList<Video> createVideoList(HttpResponse res) throws FacebookException;
    
    ResponseList<Tag> createTagList(HttpResponse res) throws FacebookException;
    
    ResponseList<GroupMember> createGroupMemberList(HttpResponse res) throws FacebookException;

    ResponseList<Insight> createInsightList(HttpResponse res) throws FacebookException;

    ResponseList<Tagged> createTaggedList(HttpResponse res) throws FacebookException;

    ResponseList<Milestone> createMilestoneList(HttpResponse res) throws FacebookException;

    Application createApplication(HttpResponse res) throws FacebookException;
    
    
    TestUser createTestUser(HttpResponse res) throws FacebookException;
    
    TestUser createTestUser(JSONObject json) throws FacebookException;

    ResponseList<JSONObject> createJSONObjectList(HttpResponse res) throws FacebookException;
    
    <T> ResponseList<T> createResponseList(HttpResponse res, Class<T> jsonObjectType) throws FacebookException;

}
