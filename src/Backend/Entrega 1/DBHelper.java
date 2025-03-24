package com.example.fecapaybackend;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    // Nome e versão do banco
    private static final String DATABASE_NAME = "fecapay.db";
    private static final int DATABASE_VERSION = 1;

    // Nome da tabela
    public static final String TABLE_USUARIOS = "usuarios";

    // Nomes das colunas
    public static final String COL_ID = "id";
    public static final String COL_NOME = "nome";
    public static final String COL_SOBRENOME = "sobrenome";
    public static final String COL_RA = "ra";
    public static final String COL_CELULAR = "celular";
    public static final String COL_CPF = "cpf";
    public static final String COL_EMAIL = "email";
    public static final String COL_SENHA = "senha";

    // Comando SQL para criar a tabela
    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + TABLE_USUARIOS + " (" +
                    COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_NOME + " TEXT NOT NULL, " +
                    COL_SOBRENOME + " TEXT NOT NULL, " +
                    COL_RA + " TEXT NOT NULL, " +
                    COL_CELULAR + " TEXT, " +
                    COL_CPF + " TEXT, " +
                    COL_EMAIL + " TEXT UNIQUE NOT NULL, " +
                    COL_SENHA + " TEXT NOT NULL);";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Criação do banco
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
    }

    // Atualização do banco (se mudar versão no futuro)
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USUARIOS);
        onCreate(db);
    }
}
