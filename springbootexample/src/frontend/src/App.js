import logo from './logo.svg';
import './App.css';
import axios from "axios";
import {useEffect, useState} from "react";

function App() {

    const [people, setPeople] = useState([]);

    useEffect(() => {
        axios.get("/api/v1/people")
            .then((res) => {
                console.log(res.data)
                setPeople(res.data)
            }).catch(err => console.log(err))
    }, [])
    return people.length > 0 ? people.map(p => {
        return <p> {p.id} {p.name} {p.age} </p>
    }) : "Empty data"
}

export default App;
