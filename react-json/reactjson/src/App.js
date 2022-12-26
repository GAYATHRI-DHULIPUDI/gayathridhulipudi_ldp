import logo from './logo.svg';
import './App.css';
import Form from './Form';
import { Route, Routes } from 'react-router-dom';
import DisplayData from './DisplayData';
function App() {
  return (
    <div className="App">
      <Routes>
        <Route index element={<Form/>}/>
        <Route path="/login" element={<DisplayData/>}/>
      {/* <First/> */}
      </Routes>
    </div>
  );
}

export default App;
