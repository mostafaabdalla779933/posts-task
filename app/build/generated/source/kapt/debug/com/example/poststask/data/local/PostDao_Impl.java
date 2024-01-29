package com.example.poststask.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.poststask.data.model.PostModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PostDao_Impl implements PostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PostModel> __insertionAdapterOfPostModel;

  private final SharedSQLiteStatement __preparedStmtOfClearCachedPosts;

  public PostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPostModel = new EntityInsertionAdapter<PostModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `post` (`id`,`title`,`body`,`userId`,`isShimmer`,`postId`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PostModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getBody() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBody());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getUserId());
        }
        final int _tmp = value.isShimmer() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        if (value.getPostId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPostId());
        }
      }
    };
    this.__preparedStmtOfClearCachedPosts = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM post";
        return _query;
      }
    };
  }

  @Override
  public Object addPost(final PostModel post, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfPostModel.insertAndReturnId(post);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object addPosts(final List<PostModel> post,
      final Continuation<? super List<Long>> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          List<Long> _result = __insertionAdapterOfPostModel.insertAndReturnIdsList(post);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clearCachedPosts(final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearCachedPosts.acquire();
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearCachedPosts.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getPosts(final Continuation<? super List<PostModel>> continuation) {
    final String _sql = "SELECT * FROM post";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<PostModel>>() {
      @Override
      public List<PostModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfIsShimmer = CursorUtil.getColumnIndexOrThrow(_cursor, "isShimmer");
          final int _cursorIndexOfPostId = CursorUtil.getColumnIndexOrThrow(_cursor, "postId");
          final List<PostModel> _result = new ArrayList<PostModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PostModel _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final Integer _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            }
            final boolean _tmpIsShimmer;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsShimmer);
            _tmpIsShimmer = _tmp != 0;
            _item = new PostModel(_tmpId,_tmpTitle,_tmpBody,_tmpUserId,_tmpIsShimmer);
            final String _tmpPostId;
            if (_cursor.isNull(_cursorIndexOfPostId)) {
              _tmpPostId = null;
            } else {
              _tmpPostId = _cursor.getString(_cursorIndexOfPostId);
            }
            _item.setPostId(_tmpPostId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
