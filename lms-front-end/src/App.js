import "./App.css";
import { AppProvider } from "./components/Context/AppContext";
import Home from "./components/Home/Home";
import { BrowserRouter as Router, Link, Route, Switch } from "react-router-dom";
import HomeContents from './components/HomeContents/HomeContents'
function App() {
  return (
    <div>
      <Router>
          <AppProvider>
            {/* <Route exact path='/' component={Home}></Route> */}
            <Home/>
            {/* <EmployeeDashboard/> */}
            {/* <MyLoan/> */}
            {/* <AdminDashboard/> */}
            {/* <EmployeeDashboard/> */}
          </AppProvider>
      </Router>
    </div>
  );
}

export default App;
