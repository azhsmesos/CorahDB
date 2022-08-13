package com.apache.corahdb.core;


import com.apache.corahdb.core.model.ColumnFamily;
import com.apache.corahdb.core.model.meta.Options;
import com.apache.corahdb.core.model.options.ColumnFamilyOptions;
import com.apache.corahdb.core.util.ArgumentExceptionUtil;
import com.apache.corahdb.core.util.FileUtils;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class CorahDBStarter {


    public static CorahDB starter(ColumnFamilyOptions opts) {
        if (!FileUtils.checkFileNotnoll(opts.getDBPath())) {
            FileUtils.createNewFolder(opts.getDBPath());
        }

        if (ArgumentExceptionUtil.checkNull(opts.getCfName())) {
            opts.setCfName(Options.default_column_family_name);
        }

        CorahDB db = new CorahDB();
        db.setOpts(opts);


        ColumnFamily columnFamily = db.openColumnFamily();

        return db;
    }
}
