package io.getstream.chat.android.core.poc.app.common;

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "channels")
public class Channel {

    @PrimaryKey
    var id: String = UUID.randomUUID().toString()

    @ColumnInfo(name = "remote_id")
    var remoteId: String = ""

    @ColumnInfo(name = "name")
    var name: String = ""

    @ColumnInfo(name = "updated_at")
    var updatedAt: Int = -1

    @ColumnInfo(name = "synced")
    var synched: Boolean = false
}