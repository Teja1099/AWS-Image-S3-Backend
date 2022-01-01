package com.teja.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("teja-springboot-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
