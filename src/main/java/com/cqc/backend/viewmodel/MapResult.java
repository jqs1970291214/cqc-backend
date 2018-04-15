package com.cqc.backend.viewmodel;

import java.util.HashMap;
import java.util.Map;

/**
 * author:Junqson
 * create:2018/4/13 23:29
 * des:
 */
public class MapResult extends ApiResult {

        private Map<String, Object> data;

        public MapResult() {
            super(200);
            this.data = new HashMap<String,Object>();
        }

        public MapResult(String key, Object value) {
            super(200);
            this.data = new HashMap<String,Object>();
            this.data.put(key, value);
        }

        public Map<String, Object> getData() {
            return data;
        }

        public void setData(Map<String, Object> data) {
            this.data = data;
        }

        public void put(String key, Object object) {
            data.put(key, object);
        }




}
