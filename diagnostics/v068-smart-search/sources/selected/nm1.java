package p000;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final class nm1 extends SQLiteOpenHelper {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nm1(Context context) {
        super(context, "smart_content_index.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE content_index (path TEXT PRIMARY KEY,modified_ms INTEGER NOT NULL,size_bytes INTEGER NOT NULL,extension TEXT NOT NULL,content TEXT NOT NULL,suggestion TEXT NOT NULL DEFAULT '')");
        sQLiteDatabase.execSQL("CREATE INDEX content_modified_idx ON content_index(modified_ms)");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS content_index");
        onCreate(sQLiteDatabase);
    }
}
