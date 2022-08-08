import java.util.Map;
import java.util.concurrent.locks.StampedLock;

import com.apache.corahdb.core.model.ColumnFamily;
import com.apache.corahdb.core.model.meta.Options;
import com.apache.corahdb.core.model.options.ColumnFamilyOptions;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class CorahDB {

    private Map<String, ColumnFamily> cfs;

    private ColumnFamilyOptions opts;

    private StampedLock mu;

    public Map<String, ColumnFamily> getCfs() {
        return cfs;
    }

    public void setCfs(Map<String, ColumnFamily> cfs) {
        this.cfs = cfs;
    }

    public ColumnFamilyOptions getOpts() {
        return opts;
    }

    public void setOpts(ColumnFamilyOptions opts) {
        this.opts = opts;
    }

    public StampedLock getMu() {
        return mu;
    }

    public void setMu(StampedLock mu) {
        this.mu = mu;
    }
}
