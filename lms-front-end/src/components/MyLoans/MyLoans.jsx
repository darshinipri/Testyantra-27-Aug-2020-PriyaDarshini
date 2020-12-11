import React from 'react';
import { Table, Thead, Tbody, Tr, Th, Td } from 'react-super-responsive-table';
import 'react-super-responsive-table/dist/SuperResponsiveTableStyle.css';
 
export default function MyLoans(props) {
  return (
    <div className="card col-md-8 offset-md-2" >
    <Table striped bordered over>
      <Thead>
        <Tr>
          <Th>LoanId</Th>
          <Th>Loan Type</Th>
          <Th>Approved On</Th>
          <Th>Amount Paid</Th>
          <Th>Pending Amount</Th>
        </Tr>
      </Thead>
      <Tbody>
        <Tr>
          <Td>Tablescon</Td>
          <Td>9 April 2019</Td>
          <Td>East Annex</Td>
          <Td>9 April 2019</Td>
          <Td>East Annex</Td>
        </Tr>
        <Tr>
          <Td>Capstone Data</Td>
          <Td>19 May 2019</Td>
          <Td>205 Gorgas</Td>
          <Td>9 April 2019</Td>
          <Td>East Annex</Td>
        </Tr>
        <Tr>
          <Td>Tuscaloosa D3</Td>
          <Td>29 June 2019</Td>
          <Td>Github</Td>
          <Td>9 April 2019</Td>
          <Td>East Annex</Td>
        </Tr>
      </Tbody>
    </Table>
    </div>
  );
}