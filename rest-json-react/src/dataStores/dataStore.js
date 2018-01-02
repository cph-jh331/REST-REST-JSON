const url = require('../../package.json').serverUrl;

class DataStore {
    constructor() {
        this._data = null;
    }

    getData = async (amount, startId, cb) => {
        const response = await fetch(url + amount + "/" + startId);
        const data = await response.json();
        this._data = data;
        if (cb) {
            cb(data);
        }
    }

    getDataAsync = async (amount, startId) => {
        const response = await fetch(url + amount + "/" + startId);
        const data = await response.json();
        this._data = data;
        return this._data;
    }
}

export default new DataStore();