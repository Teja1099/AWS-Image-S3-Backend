package com.teja.awsimageupload.datastore;

import com.teja.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("309ef6d4-9635-428c-a09b-3ba0343a3678"),"janetjones",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("b931403c-d366-450c-b864-d1882e315ef7"),"antoniojunior",null));

    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
