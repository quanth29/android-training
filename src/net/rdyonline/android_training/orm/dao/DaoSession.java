package net.rdyonline.android_training.orm.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import net.rdyonline.android_training.orm.Conference;
import net.rdyonline.android_training.orm.Room;
import net.rdyonline.android_training.orm.Speaker;
import net.rdyonline.android_training.orm.Timeslot;

import net.rdyonline.android_training.orm.dao.ConferenceDao;
import net.rdyonline.android_training.orm.dao.RoomDao;
import net.rdyonline.android_training.orm.dao.SpeakerDao;
import net.rdyonline.android_training.orm.dao.TimeslotDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig conferenceDaoConfig;
    private final DaoConfig roomDaoConfig;
    private final DaoConfig speakerDaoConfig;
    private final DaoConfig timeslotDaoConfig;

    private final ConferenceDao conferenceDao;
    private final RoomDao roomDao;
    private final SpeakerDao speakerDao;
    private final TimeslotDao timeslotDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        conferenceDaoConfig = daoConfigMap.get(ConferenceDao.class).clone();
        conferenceDaoConfig.initIdentityScope(type);

        roomDaoConfig = daoConfigMap.get(RoomDao.class).clone();
        roomDaoConfig.initIdentityScope(type);

        speakerDaoConfig = daoConfigMap.get(SpeakerDao.class).clone();
        speakerDaoConfig.initIdentityScope(type);

        timeslotDaoConfig = daoConfigMap.get(TimeslotDao.class).clone();
        timeslotDaoConfig.initIdentityScope(type);

        conferenceDao = new ConferenceDao(conferenceDaoConfig, this);
        roomDao = new RoomDao(roomDaoConfig, this);
        speakerDao = new SpeakerDao(speakerDaoConfig, this);
        timeslotDao = new TimeslotDao(timeslotDaoConfig, this);

        registerDao(Conference.class, conferenceDao);
        registerDao(Room.class, roomDao);
        registerDao(Speaker.class, speakerDao);
        registerDao(Timeslot.class, timeslotDao);
    }
    
    public void clear() {
        conferenceDaoConfig.getIdentityScope().clear();
        roomDaoConfig.getIdentityScope().clear();
        speakerDaoConfig.getIdentityScope().clear();
        timeslotDaoConfig.getIdentityScope().clear();
    }

    public ConferenceDao getConferenceDao() {
        return conferenceDao;
    }

    public RoomDao getRoomDao() {
        return roomDao;
    }

    public SpeakerDao getSpeakerDao() {
        return speakerDao;
    }

    public TimeslotDao getTimeslotDao() {
        return timeslotDao;
    }

}
