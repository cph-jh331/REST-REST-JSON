import React, { Component } from 'react';
import dataStore from '../dataStores/dataStore';

export default class DataTable extends Component {
    constructor(props) {
        super(props);
        this.state = {
            error: null,
            persons: [],
            amount: 1,
            startId: 0,
        };
    }

    /*
    normal fetch thingie med callback
    componentWillMount() {
        dataStore.getData(50, 1, persons => {
            this.setState({ persons });
        })
    }
    */


    async componentWillMount() {
        /* async await uden callback
        this.setState({ persons: await dataStore.getDataAsync(50, 1) });
        */
        // deles op i to:
        let persons = await dataStore.getDataAsync(50, 1);
        this.setState({ persons });
    }

    onChangeHandler = (event) => {
        let target = event.target;
        let name = target.name;
        let value = target.value;
        this.setState({
            [name]: value
        })
    }

    onSubmitHandler = async (event) => {
        event.preventDefault();
        const amount = this.state.amount;
        const startId = this.state.startId;
        let persons = await dataStore.getDataAsync(amount, startId);
        this.setState({ persons });
    }

    render() {
        console.log(this.state);
        const persons = this.state.persons;
        return (
            <div>
                <div className="form-inline">
                    <form onSubmit={this.onSubmitHandler}>
                        <label>Amount:</label>
                        <input name="amount" className="form-control" type="number" onChange={this.onChangeHandler} value={this.state.amount} placeholder="amount" min="1" required />
                        <label>Start Id:</label>
                        <input name="startId" className="form-control" type="number" onChange={this.onChangeHandler} value={this.state.startId} placeholder="start id" min="0" required />
                        <button className="btn btn-success" type="submit">Gen Data</button>
                    </form>
                </div>
                <table className="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Age</th>
                        </tr>
                    </thead>
                    <tbody>
                        {persons.map(person => (
                            <tr key={person.id}>
                                <td>{person.id}</td>
                                <td>{person.fName}</td>
                                <td>{person.lName}</td>
                                <td>{person.age}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        )
    }

}