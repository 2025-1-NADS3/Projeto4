package com.example.fecapaybackend;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioDAO {

    private DBHelper dbHelper;

    // Construtor recebe o contexto da activity
    public UsuarioDAO(Context context) {
        dbHelper = new DBHelper(context);
    }

    // ------------------- CREATE (Cadastrar novo usuário) -------------------
    public boolean cadastrarUsuario(String nome, String sobrenome, String ra, String celular,
                                    String cpf, String email, String senha) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(DBHelper.COL_NOME, nome);
        valores.put(DBHelper.COL_SOBRENOME, sobrenome);
        valores.put(DBHelper.COL_RA, ra);
        valores.put(DBHelper.COL_CELULAR, celular);
        valores.put(DBHelper.COL_CPF, cpf);
        valores.put(DBHelper.COL_EMAIL, email);
        valores.put(DBHelper.COL_SENHA, senha);

        long resultado = db.insert(DBHelper.TABLE_USUARIOS, null, valores);
        db.close();

        return resultado != -1;
    }

    // ------------------- READ (Verificar login) -------------------
    public boolean verificarLogin(String email, String senha) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String query = "SELECT * FROM " + DBHelper.TABLE_USUARIOS +
                " WHERE " + DBHelper.COL_EMAIL + " = ?" +
                " AND " + DBHelper.COL_SENHA + " = ?";

        String[] args = { email, senha };

        Cursor cursor = db.rawQuery(query, args);
        boolean existe = cursor.moveToFirst();
        cursor.close();
        return existe;
    }

    // ------------------- UPDATE (Atualizar senha) -------------------
    public boolean atualizarSenha(String email, String novaSenha) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(DBHelper.COL_SENHA, novaSenha);

        int linhasAfetadas = db.update(DBHelper.TABLE_USUARIOS, valores,
                DBHelper.COL_EMAIL + " = ?", new String[]{email});

        return linhasAfetadas > 0;
    }

    // ------------------- DELETE (Excluir conta) -------------------
    public boolean excluirUsuario(String email, String senha) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        int linhasAfetadas = db.delete(DBHelper.TABLE_USUARIOS,
                DBHelper.COL_EMAIL + " = ? AND " + DBHelper.COL_SENHA + " = ?",
                new String[]{email, senha});

        return linhasAfetadas > 0;
    }
}
