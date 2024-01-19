package com.blog.app.blog.mappers;

import com.blog.app.blog.entities.Tag;
import com.blog.app.blog.payloads.TagData;

public final class TagMapper {
    
    public static TagData mapToData(Tag tag) {
        TagData tagData = new TagData();

        tagData.setId(tag.getId());
        tagData.setName(tag.getName());

        return tagData;
    }

    public static Tag mapToEntity(TagData tagData) {
        Tag tag = new Tag();

        tag.setName(tagData.getName());

        return tag;
    }
}
