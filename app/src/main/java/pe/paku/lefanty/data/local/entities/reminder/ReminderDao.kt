package pe.paku.lefanty.data.local.entities.reminder

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ReminderDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addReminder(reminder: Reminder)

    @Query("SELECT * FROM reminder_table ORDER BY id ASC")
    fun readAllTable(): LiveData<List<Reminder>>

    @Query("SELECT * FROM reminder_table ORDER BY id ASC")
    fun readAllTablev2(): List<Reminder>

}